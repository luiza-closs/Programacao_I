# Aula 005 - Exercicio 1
## Heranças
São as características adquiridas de gerações passadas, da mesma forma em programação Orientada a Objetos, herança é a capacidade de estender uma classe já definida. É construir cçasses com base em outra classe já existente.
```
Exemplo
Classe Mãe: Pessoa
Classes Filhas: Aluno, Professor
```
As classes filhas tem todos os atributos da classe mãe + atributos especificos.

### Tipos de Heranças:
Simples e Multiplas.
Simples herdam de uma classe mãe unica, já a herança Multipla é uma classe filha que herda de mais de uma classe mãe.

### Heranças, composições ou compartilhamento?
```
Exemplo:
Carro e Motor
    Carro é Motor? Não
    Carro possui Motor? Sim - Composição

Conta e Poupança
    Conta é uma poupança? Sim - Herança
    Conta possui uma poupança? Não
```

Chamamos de herança quando novas classes herdam propriedades (atributos e metodos) de outras classes já definidas. A ideia é proporcionar reutilização de código. A palavra extends é a marcação para implementar a herança.