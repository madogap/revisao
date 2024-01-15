/*
  Altera os valores do array 
    e sempre tera o mesmo tamanho do array original
*/
const numeros = [5, 12, 23, 45, 6, 7, 45];
//Dobrar os valores do array
const numerosDobrados = numeros.map(valor => valor * 2 );
console.log(numerosDobrados);

//Objeto
const pessoas = [
  { nome: 'Luiz', idade: 62},
  { nome: 'Maria', idade: 23},
  { nome: 'Eduardo', idade: 55},
  { nome: 'Leticia', idade: 19},
  { nome: 'Rosana', idade: 32},
  { nome: 'Wallace', idade: 47},
];

//Retorne apenas uma string com o nome da pessoa
const nomes = pessoas.map(obj => obj.nome);
console.log(nomes);

//Remova apenas a chave "nome" do objeto
const idades = pessoas.map(obj => ({ idade: obj.idade }));
console.log(idades);

//Adicione uma chave id em cada objeto
const addChaveComId = pessoas.map(function(obj, index){
  obj.id = (index + 1);
  return obj;
});
//console.log(addChaveComId);

//Adicione uma chave id em cada objeto
const addChaveComIdN = pessoas.map(function(obj, index){
  const newObj = {...obj};
  newObj.id = index;
  return newObj;
});
console.log(pessoas);
console.log(addChaveComIdN);