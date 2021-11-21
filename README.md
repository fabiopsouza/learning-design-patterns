# Design Patterns

**Definição:** Soluções comuns para problemas recorrentes ao utilizar orientação a objetos
**Base:** Livro Design Patterns - Elements of Reusable Object-Oriented Software

## Categorias

- **Criacionais:** Criação dos objetos
- **Estruturais:** Estrutura e composição das classes
- **Comportamentais:** Métodos, estado e interação entre objetos

## Patterns

- **Strategy:** Usado para evitar if-else / switch-case quando tem várias regras para executar que variam de acordo com um parâmetro
  - Exemplo: [CalculadoraDeImpostos.java](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/imposto/CalculadoraDeImpostos.java)
  - Referência: [Strategy](https://refactoring.guru/pt-br/design-patterns/strategy)
- **Chain of Responsability (Fluxo de Responsabilidades):** Usado quando precisa executar diferentes processamentos de acordo com determinadas regras, mas ao contrário do Strategy, não se de antemão (parâmetro) sabe qual delas devem ser aplicadas. A cada regra verificada, deve ser chamado a próxima para verificar também. 
  - Exemplo: [CalculadoraDeDescontos.java](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/desconto/CalculadoraDeDescontos.java)
  - Referência: [Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)
- **Template Method:** Método em uma classe mãe que define apenas o esqueleto de uma operação chamando métodos abstratos. A implementação desses métodos fica na classe filha
	- Exemplo: [Desconto.java](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/desconto/Desconto.java)
	- Referência: [Template Method](https://refactoring.guru/pt-br/design-patterns/template-method)
- **State:** A classe de estado tem o comportamento da sua operação. Ao mudar de estado, muda qual sera o comportamento da operação (que passa a ser de acordo com o novo estado selecionado)
	- Exemplo: [SituacaoOrcamento.java](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/orcamento/situacao/SituacaoOrcamento.java)
	- Referência: [State](https://refactoring.guru/pt-br/design-patterns/state)
- **Command:** Centraliza uma lógica ação de uma regra negócio para que possa ser chamado por diferentes tipos de clientes. Ex: UI, API, Command Line, etc...
	- Exemplo: [GeraPedidoHandler.java (execute)](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/pedido/GeraPedidoHandler.java)
	- Referência: [Command](https://refactoring.guru/pt-br/design-patterns/command)
- **Observer:** Uma classe Publisher tem uma lista de subscribers. A classe publisher notifica os subscribers de um determinado evento para que cada uma tome a sua ação correspondente
	- Exemplo: [GeraPedidoHandler.java (acoes)](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/pedido/GeraPedidoHandler.java)
	- Referência: [Observer](https://refactoring.guru/pt-br/design-patterns/observer)
