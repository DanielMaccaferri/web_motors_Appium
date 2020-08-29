#language:pt
#encoding UTF-8


@geral
Funcionalidade: Visitar tela home
   
@visitar
Cenario: Validar abertura do Aplicativo
	 
   Entao a tela home deve aparecer
   
@cadastro 
Cenario: Criar uma conta
   Quando eu clicar em criar conta
   Quando eu inserir os dados
   Entao a conta deve ser criada
   