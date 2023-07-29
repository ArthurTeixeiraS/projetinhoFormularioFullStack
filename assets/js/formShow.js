class FormShow{
    constructor(form){
        this.form = form
    }
    formShow(){
        fetch('http://localhost:8080/api/formulario/mostrar-tudo')
            .then(response => response.json())
            .then(data => {
                const userListElement = document.getElementById('userList');
                data.forEach(user => {
                    const listItem = document.createElement('li');
                    listItem.textContent = `Nome: ${user.name}, Sobrenome:${user.sobrenome}, CPF: ${user.cpf}, Username:${user.usuario}, Senha:${user.senha}`;
                    userListElement.appendChild(listItem);
                });
            })
            .catch(error => {
                console.error('Erro ao obter a lista de cadastrados:', error);
            });
    }
}