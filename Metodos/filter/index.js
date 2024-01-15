
/*
  Filter nao altera o elemento 
  sempre retorna um array com a mesma quantidade de elementos ou menos
*/
const numeros = [5, 12, 23, 45, 6, 7, 45, 78, 90, 1, 2, 3, 8, 11, 15, 22, 27];

function callbackFilter(valor) {
  return valor > 10;
};

const numerosFiltrados = numeros.filter(callbackFilter);
//console.log(numerosFiltrados);

const numerosFiltradosArrowFunction = numeros.filter((valor, index, array)=>{
  console.log(valor, index, array);
  return valor > 30;
});
const numerosFiltradosArrowFunctionReduzida = numeros.filter(valor => valor > 30);
//console.log(numerosFiltradosArrowFunction);

//Objeto
const pessoas = [
  { nome: 'Luiz', idade: 62},
  { nome: 'Maria', idade: 23},
  { nome: 'Eduardo', idade: 55},
  { nome: 'Leticia', idade: 19},
  { nome: 'Rosana', idade: 32},
  { nome: 'Wallace', idade: 47},
];

// Retorne as pessoas que tem o nome com 5 letras ou mais
const pessoasNomeGrande = pessoas.filter( obj => obj.nome.length >= 5);
console.log(pessoasNomeGrande);

//Retorne as pessoas com mais de 50 anos
const pessoasMaisAnos = pessoas.filter(obj => obj.idade > 50);
console.log(pessoasMaisAnos);

//Retorne as pessoas cujo nome termina com a
const nomeTerminaComA = pessoas.filter(
  obj => obj.nome.toLocaleLowerCase().endsWith('a')
);
console.log(nomeTerminaComA);