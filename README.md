# itauAPIWEB
Teste técnico em relação a vaga de back-end do Back Itau, em que consiste em criar uma aplicação que exponha uma api web que valide se uma senha é válida com algumas restrições:

<p>• Nove ou mais caracteres</p>
<p>• Ao menos 1 dígito</p>
<p>• Ao menos 1 letra minúscula</p>
<p>• Ao menos 1 letra maiúscula</p>
<p>• Ao menos 1 caractere especial</p>

<p>Considere como especial os seguintes caracteres: !@#$%^&*()-+</p>
<p>Não possuir caracteres repetidos dentro do conjunto</p>

<p> A lógica dessa api web foi desenvolvida através de variaveis booleanas, em que de ínicio é "false" mas através das estruturas condicionais (ifs) ela se torna verdadeira. Como exemplo, em nosso código ele contém um "for" que percorrerá verificando se a senha digitada contem números retornando "true". </p>
  
    //VETOR DA SENHA
		char[] arraySenha = objetoLogin.getSenha().toCharArray();
		
		//VARIAVEIS LÓGICAS
		boolean verificarNumero = false, verificarMinusculo = false, verificarMaiusculo = false,
		verificarEspecial = false, verificarRepeticao = false, senha = false;
		
		//EXECUÇÃO DO LAÇO DE REPETIÇÃO
		for(int x = 0; x < objetoLogin.getSenha().length();x++) {
			
			//ESTRUTURAS CONDICIONAIS
			if((arraySenha[x] >= '0') && (arraySenha[x] <= '9')) {
				verificarNumero = true;
			}
   

<img src="https://i.imgur.com/8NL8D5k.png" alt="Capa">

## 💻 Pré-requisitos para executar o projeto localmente

Antes de começar, verifique se você atendeu aos seguintes requisitos:
<!---Estes são apenas requisitos de exemplo. Adicionar, duplicar ou remover conforme necessário--->
* Você instalou a versão mais recente de `<JDK Java 11 / IDE Eclipse ou Netbeans / XAMPP / Git e GitHub / MySQL Workbench 8>`
* Você tem uma máquina `<Windows / Mac / Linux>`.

## 🚀 Instalando o itauAPIWEB

Para instalar o itauAPIWEB, siga estas etapas:

Abra o GitBash e clone o repositório para sua máquina:
```
git clone https://github.com/victorigoleto/itauAPIWEB.git
```
<img src="https://i.imgur.com/fTZdrzm.png" alt="GitBash">


## ☕ Usando o itauAPIWEB

Para usar itauAPIWEB, abra o XAMPP e a sua IDE de escolha e siga esses passos:

```
Acione o Apache e o MySQL clicando em Start em ambos
```
<img src="https://i.imgur.com/SxI5nAA.png" alt="XAMPP">


```
Agora abra sua IDE de escolha e importa o seu projeto clicando em "Existing Maven Projects"
```
<img src="https://i.imgur.com/GCulvQM.png" alt="Maven Project">


```
Com seu projeto importado execute a aplicação na classe padrão "LoginApplication" clicando em Run As -> Java Aplication ou Spring Boot App (caso esteja no Spring Tool Suite) 
```
<img src="https://i.imgur.com/66DI12s.png" alt="Rodando a aplicação">

```
Agora abra o seu navegador web e digite "http://localhost:8080/", irá aparecer o formulario api web
```
<img src="https://i.imgur.com/Ux3rdq8.png" alt="Formulario api web">


```
As tratativas de erro foram feitas em HTML/JavaScript com o plugin de alerta SweetAlert2
```
<img src="https://i.imgur.com/KhjdAZQ.png" alt="Tratativa de Erro">
<img src="https://i.imgur.com/3YLG451.png" alt="Tratativa de Erro">

```
Para verificar se os dados foram inseridos corretamente, abra o MySQL WorkBench 8 e cria uma nova query executando os seguintes comandos:
```
<img src="https://i.imgur.com/TcRYAEu.png" alt="MySQL WorkBench">



[⬆ Voltar ao topo](#nome-do-projeto)<br>

