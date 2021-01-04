var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

  $scope.cadastro = new Object();

$scope.salvar = function() {
  $http.post("http://localhost:8080/login", {
    'id':$scope.id,
    'nome':$scope.nome,
    'cpf':$scope.cpf,
    'email':$scope.email,
    'senha':$scope.senha
    
  }).then(resposta => {
  	Swal.fire('OK', 'Cliente cadastrado!!', 'success')
  }).catch(erro => {
  	Swal.fire('Erro !!', 'O CPF, Email ou a Senha é invalida! <br><br>Modelo de CPF: 11122233344<br><br>Modelo de Senha: AbTp9!fok <br>Não pode ter caracteres repetidos <br>Mínimo 1 Maiuscula <br>Mínimo 1 Minuscula <br>Mínimo 1 numero <br>Mínimo 1 caractere especial: !@#$%^&*()-+)', 'error')

  })
  };  

});