async function buscarFrase() {
    // Note a porta 8080 que é o padrão do Java
    const resposta = await fetch('http://localhost:8080/api/frase');
    const dados = await resposta.json();
    
    document.getElementById('texto-frase').innerText = dados.mensagem;
}