function tocar_som(seletor_audio) {
    const retorno = document.querySelector(seletor_audio);

    if (retorno === null) {
        alert('Elemento não encontrado! Tente com outro elemento :)');
    } else if (retorno.localName != 'audio') {
        alert('Este não é um elemento do tipo audio. Tente com outro elemento :)')
    } else {
        retorno.play();
    }
}

const lista_teclas = document.querySelectorAll('.tecla')

for (let i = 0; i < lista_teclas.length; i++) {

    const tecla = lista_teclas[i];
    const instrumento = tecla.classList[1];
    const id_audio = `#som_${instrumento}`
    tecla.onclick = function() {
        tocar_som (id_audio);
    }

    tecla.onkeydown = function(evento) {
        if (evento.code === 'Enter' || evento.code === 'Space') {
            tecla.classList.add('ativa');
        }
    }

    tecla.onkeyup = function() {
        tecla.classList.remove('ativa');
    }

}


