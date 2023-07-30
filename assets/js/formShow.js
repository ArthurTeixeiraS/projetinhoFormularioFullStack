    (function formShow(){
        fetch('http://localhost:8080/api/formulario/mostrar-tudo')
            .then(response => response.json())
            .then(data => {
                const userListElement = document.getElementById('employeeList');
                data.forEach(user => {
                    const listItem = document.createElement('li');
                    listItem.textContent = `Nome: ${user.name}, Sobrenome:${user.lastName}, CPF: ${user.cpf}, Username:${user.user}, Senha:${user.password}`;
                    userListElement.appendChild(listItem);
                });
            })
            .catch(error => {
                console.error('Erro ao obter a lista de cadastrados:', error);
            });
    })()