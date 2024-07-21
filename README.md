
# Simulação de Smart TV em Java

Este projeto é uma aplicação Java simples que simula as funcionalidades básicas de uma Smart TV. Inclui operações como ligar e desligar a TV, mudar o volume e trocar de canal.

## Começando

### Pré-requisitos

- Java Development Kit (JDK) instalado em sua máquina.
- Um editor de código ou um Ambiente de Desenvolvimento Integrado (IDE) como IntelliJ IDEA ou Eclipse.

### Executando a Aplicação

1. **Clone o Repositório**:
    ```bash
    git clone https://github.com/yourusername/smart-tv-simulation.git
    cd smart-tv-simulation
    ```

2. **Compile o Código**:
    ```bash
    javac Usuario.java
    ```

3. **Execute a Aplicação**:
    ```bash
    java Usuario
    ```

## Visão Geral do Código

### Classe Principal: `Usuario`

A classe `Usuario` contém o método `main`, que serve como ponto de entrada para a aplicação. Realiza as seguintes operações:

1. **Inicializar uma nova Smart TV**:
    ```java
    SmartTv smartTv = new SmartTv();
    ```

2. **Imprimir o status inicial da TV**:
    ```java
    System.out.println("TV Ligada? " + smartTv.ligada);
    System.out.println("Canal Atual? " + smartTv.canal);
    System.out.println("Volume Atual? " + smartTv.volume);
    ```

3. **Ligar e desligar a TV**:
    ```java
    smartTv.ligar(); // Ligando a TV
    System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);
    smartTv.desligar(); // Desligando a TV
    System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);
    ```

4. **Aumentar e diminuir o volume**:
    ```java
    smartTv.aumentar(); // Aumentar volume
    smartTv.aumentar();
    smartTv.aumentar();
    System.out.println("Volume Atual? " + smartTv.volume);

    smartTv.abaixar(); // Diminuir volume
    System.out.println("Volume Atual? " + smartTv.volume);
    ```

5. **Mudar o canal**:
    ```java
    smartTv.aumentarCanal(); // Aumentar canal
    System.out.println("Novo Status - Canal: " + smartTv.canal);

    smartTv.mudarCanal(20); // Mudar para um canal específico (ex: 20)
    System.out.println("Canal atual: " + smartTv.canal);
    ```

### Classe Suporte: `SmartTv`

A classe `SmartTv` deve incluir as seguintes funcionalidades:

- **Atributos**:
    - `boolean ligada` - Indica se a TV está ligada ou desligada.
    - `int canal` - Armazena o canal atual.
    - `int volume` - Armazena o nível de volume atual.

- **Métodos**:
    - `void ligar()` - Liga a TV.
    - `void desligar()` - Desliga a TV.
    - `void aumentar()` - Aumenta o volume.
    - `void abaixar()` - Diminui o volume.
    - `void aumentarCanal()` - Aumenta o canal.
    - `void mudarCanal(int novoCanal)` - Muda para um canal específico.

## Exemplo de Saída

```plaintext
TV Ligada? false
Canal Atual? 1
Volume Atual? 25
Novo Status - TV Ligada? true
Novo Status - TV Ligada? false
Volume Atual? 28
Volume Atual? 27
Novo Status - Canal: 2
Canal atual: 20
```

## Licença

Este projeto é licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Sinta-se à vontade para contribuir com este projeto enviando pull requests ou abrindo issues. Para quaisquer perguntas ou sugestões, por favor, entre em contato pelo e-mail [seu-email@example.com](mailto:seu-email@example.com).
