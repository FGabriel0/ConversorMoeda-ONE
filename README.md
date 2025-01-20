# Conversor de Moedas

Este é um conversor de moedas simples desenvolvido em **Java** que utiliza a **Exchange Rate API** para obter taxas de câmbio em tempo real. O projeto segue o paradigma de programação orientada a objetos e oferece uma interface textual (via console) para interação com o usuário.

## Objetivos

- Conversão de moedas em tempo real entre as seguintes opções:
  - USD (Dólar Americano) para EUR (Euro)
  - EUR (Euro) para USD (Dólar Americano)
  - USD (Dólar Americano) para BRL (Real Brasileiro)
  - BRL (Real Brasileiro) para USD (Dólar Americano)
  - EUR (Euro) para BRL (Real Brasileiro)
  - BRL (Real Brasileiro) para EUR (Euro)
- O programa oferece um menu para que o usuário possa selecionar as moedas, inserir o valor e obter a conversão.

## Tecnologias Utilizadas

- **Java 11** ou superior (utilizando o `HttpClient` do JDK)
- **Gson 2.10.1** para manipulação de JSON
- **Exchange Rate API** para obter as taxas de câmbio em tempo real

## Requisitos

- **Java 11** ou superior
- Biblioteca Gson (você pode adicionar o arquivo `.jar` ou configurar o Maven)

## Instalação

1. **Clonar o repositório**:

   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   cd conversor-moedas-java
   Baixar o arquivo gson-2.10.1.jar:

2. **baixar a biblioteca Gson a partir do Maven Repository**:

   ```bash
   Adicione o arquivo .jar ao caminho de build (classpath) do projeto no Eclipse ou outro IDE de sua escolha.

3. **Configurar a chave da API**:
```
  Obtenha uma chave de API gratuita na Exchange Rate API.
  Substitua "SUA_API_KEY_AQUI" no arquivo ExchangeRateService.java pela sua chave de API.
```

4. **Executar o projeto** :
```
No Eclipse ou outro IDE, execute a classe Main para iniciar o programa.
O programa apresentará um menu no console para que você escolha as moedas e o valor a ser convertido.

```
## Exemplo de Uso
Quando o programa for executado, ele exibirá um menu como o seguinte:
```
==== Conversor de Moedas ====
Escolha uma opção de conversão:
1. USD para EUR
2. EUR para USD
3. USD para BRL
4. BRL para USD
5. EUR para BRL
6. BRL para EUR
7. Sair
Opção: 1
Informe o valor a ser convertido: 100
Resultado: 100.00 USD = 84.32 EUR
```
## Estrutura do Projeto
```
├── src
│   ├── com/conversor/moedas
│   │   ├── CurrencyConverter.java       # Classe principal de interação com o usuário
│   │   ├── ExchangeRateService.java      # Classe responsável pela interação com a API
│   │   └── Main.java                     # Classe de entrada para o programa
├── gson-2.10.1.jar                       # Biblioteca Gson para manipulação de JSON
└── README.md                             # Instruções do projeto


