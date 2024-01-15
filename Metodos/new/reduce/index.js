//Reduzir um array em um unico elemento


//Some todos os numeros
const numeros = [5, 12, 23, 45, 6, 7, 45, 10, 8, 16, 24, 40];

const total = numeros.reduce(function(acumulador, valor, index, array){
  //console.log(acumulador, valor);
  acumulador += valor;
  return acumulador;
}, []);
//console.log(total);

//retorne um array com os pares (filter)
const totalPares = numeros.reduce(function(acumulador, valor, index, array){
  if (valor % 2 === 0) acumulador.push(valor);
    return acumulador;
}, []);
console.log(totalPares);

//impares
const totalImpar = numeros.reduce(function(acumulador, valor, index, array){
  if (valor % 2 !== 0) acumulador.push(valor);
    return acumulador;
}, []);
console.log(totalImpar);

//Mutiplos de 8
const totalMultiplosOito = numeros.reduce(function(acumulador, valor, index, array){
  if (valor % 8 === 0) acumulador.push(valor);
    return acumulador;
}, []);
console.log(totalMultiplosOito);

//Retorne um array com o dobro dos valores (map)
const totalDobro = numeros.reduce(function(acumulador, valor){
  acumulador.push(valor * 2);
    return acumulador;
}, []);

console.log(totalDobro);


const totalReduce = numeros.reduce(function(acumulador, valor, index, array){
  if(valor % 2 === 0){
    acumulador += valor;
  }  
  return acumulador;
},0);
console.log(totalReduce);


//retorne a pessoa mais velha

const pessoas = [
  { nome: 'Luiz', idade: 62},
  { nome: 'Maria', idade: 23},
  { nome: 'Eduardo', idade: 55},
  { nome: 'Leticia', idade: 19},
  { nome: 'Rosana', idade: 32},
  { nome: 'Wallace', idade: 470},
]

const maisVelha = pessoas.reduce(function(acumulador, valor){
  if (acumulador.idade > valor.idade) return acumulador;
  return valor;
}, 0);
console.log(maisVelha);