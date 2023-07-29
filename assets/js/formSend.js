class FormSend{
    constructor(form){
        this.form = form
    }

    formGet(){
        const name = document.querySelector('.nome').value
        const lastName = document.querySelector('.sobrenome').value
        const cpf = document.querySelector('.cpf').value
        const user = document.querySelector('.usuario').value
        const password = document.querySelector('.senha').value
        let requestData = {};
        requestData = {
            name: name,
            lastName: lastName, 
            cpf: cpf, 
            user: user, 
            password: password
        }
        console.log(requestData)
        this.submit(requestData)

    }
     async submit(requestData){
        await fetch('http://localhost:8080/api/formulario/salvar', {   
            method:'POST',
            headers:{
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(requestData)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Resposta:', data)
        })
        .catch(error => {
            console.log('Erro ao fazer o post: ', error)
        });   
    }
}