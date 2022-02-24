## MJV School - Exercício Collections Framework

# Interface Map

### O que é uma Interface?

Uma interface na linguagem de programação Java é um tipo abstrato usado para especificar um comportamento que as classes devem implementar. 

As interfaces são declaradas usando a palavra-chave interface e podem conter apenas assinaturas de métodos e declarações de constantes.

### O que é Map? (Breve descrição)

Segundo a documentação oficial da Oracle, um Map é uma interface que armazena valores baseados em pares de "key/value pair", ou seja, par de chave e valor. 
Cada par de chave e valor é conhecido como uma "entry" (entrada). Um Map contém chaves exclusivas.

Um Map é útil se você precisar pesquisar, atualizar ou excluir elementos com base em uma chave específica.

#### Sintaxe

``` Map<TipoDaChave, TipoDoValor> nomeDoMap = new HashMap<>(); ```

Obs: a classe HashMap não é a única classe que pode utilizar a interface Map. 

### Métodos mais utilizados

- ```clear()``` Remove todos os elementos do Map.
- ```containsKey()``` Retorna true se o mapa possuir a key especificada. Sobrecarregado.
- ```containsValue()``` Retorna true se o mapa possuir o valor especificado. Sobrecarregado.
- ```get()``` Retorna o valor da chave informada. Sobrecarregado.
- ```put()``` Adiciona um novo par de chave/valor ao Map. Sobrecarregado.
- ```size()``` Retorna o número de entries existentes no Map. 

### Implementação

A classe mais comum que implementa a interface ```Map``` é a classe Java ```HashMap```. 
Um ```HashMap``` é uma implementação baseada em tabela de hash da interface Map. Permite chaves e valores nulos. Além disso, essa classe não mantém nenhuma ordem entre seus elementos e, principalmente, não garante que a ordem permaneça constante ao longo do tempo. 
