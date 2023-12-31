function adicionarItens() {
    var novaLinha = document.createElement("div");
    novaLinha.className = "linha3"; // Atualize para a próxima linha disponível (linha3, linha4, etc.)

    for (var i = 1; i <= 3; i++) {
        var novoItem = document.createElement("div");
        novoItem.className = "item" + (i + 6); // Atualize para o próximo item disponível (item7, item8, etc.)

        // Aqui você pode adicionar o conteúdo desejado para cada novo item
        novoItem.innerHTML = `
        <div class="Card">
            <!--Imagem-->
            <div class="Imagem_container">
                <div class="Imagem">
                    <a href="#">
                        <img src="Imagens/Centro/Ralsei.jpeg" alt="Pelúcia Ralse" class="Imagem_produto">
                    </a>
                </div>
            </div>
            <!--Texto do card-->
            <h1 class="Nome_Produto">Pelúcia Ralsei</h1>
            <p class="preco primeiro"><s>R$99,99</s></p>
            <p class="preco">R$89,99</p>
            <!--Botão "Comprar agora"-->
            <div class="Comprar_Agora primeiro">
                <button class="Comprar_Agora">
                    <h2 class="Comprar_Agora">Comprar Agora</h2>
                </button>
            </div>
        </div>
    `;
        novaLinha.appendChild(novoItem);
    }

    // Adiciona a nova linha ao final da seção de itens
    document.querySelector('.itens').appendChild(novaLinha);
}