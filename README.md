# Cadeira: Desenvolvimento de Serviços Web e Testes com Java
## Teste performance 1
## Exercício 11: Validação de Nota na Classe `Aluno` e Teste de Unidade

### Descrição

Neste exercício, o objetivo é expandir a classe `Aluno` para incluir a validação das notas e criar um novo teste de unidade para verificar essa validação.

### Objetivo

O objetivo principal é garantir que as notas dos alunos atendam ao seguinte critério ao serem definidas:
- As notas devem estar no intervalo de 0 a 10.

Caso uma nota esteja fora desse intervalo, o método `setNota` deve lançar uma exceção específica. A classe de testes deve verificar se esse comportamento está correto.

### Especificações

1. **Classe `Aluno`**:
   - A classe deve ser atualizada para incluir a validação das notas.
   - O método `setNota` deve verificar se a nota está entre 0 e 10.
   - Se a nota estiver fora desse intervalo, o método deve lançar uma exceção.

2. **Classe de Testes**:
   - Desenvolva uma classe de testes utilizando JUnit para verificar se o método `setNota` lança uma exceção quando a nota está fora do intervalo permitido.
   - A classe de testes deve capturar e tratar a exceção, assegurando que o método está funcionando corretamente.

### Considerações

Este exercício reforça a importância de validações de entrada de dados, especialmente em contextos acadêmicos, onde a precisão das notas é crucial. A prática de criar testes de unidade para verificar essas validações é essencial para garantir a confiabilidade do código.
