package br.com.digitalonline.opuserp.controller.cadastros.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.digitalonline.opuserp.OpuserpApplication;
import br.com.digitalonline.opuserp.dao.ClienteDAO;

@Controller
public class ClientesController {

    
    @Autowired
    ClienteDAO dao;
    
    @RequestMapping("cadastro/cliente")
    public String clientes(Model model){

        if(OpuserpApplication.getUsuarioLogado() != null){
            model.addAttribute("clientes",dao.listar());                        
            return "cadastro/cliente/index";
        }else{
            return "login";
        }
    }
    
}


//R$1800,00 - 3,49%
// taxa (62,82)
//4x434 = 1736,00
//1- 434 - ok
//2- 434 - ok
//3- 434 - ok
// 2862,37
//









//Apresentação
//Introdução
//Prefacio Autor
//1- Primeiras Impressões
//2- A Preparação da Coréia para o Evangelho












// Não é de se estranhar que a Coréia seja pobre. Não somente ela tem sido
// continuamente devastada pela guerra, como também o seu próprio governo tem sido
// indigno e corrupto. Por séculos seus reis delegavam o domínio aos magistrados e
// governantes que pagavam muitas vezes seu salário pelo cargo e então, através de
// métodos injustos, recuperavam do povo essa quantia e muito mais. Para um homem
// acumular algo naqueles dias teria de gastar toda a sua vida, a não ser que tivesse
// amigos poderosos para protegê-lo. Se os ladrões não se importassem em descer das
// montanhas para levar embora seu dinheiro, o magistrado ladrão enviaria seus
// "mensageiros", prenderiam-no sob alguma acusação espalhafatosa, jogariam-no na
// cadeia e o espancariam até que ficasse satisfeito em pagar tudo o que havia acumulado
// durante a sua vida.
// Recentemente, o maior infortúnio de todos, pelo menos aos olhos dos coreanos,
// sobreveio ao seu país. Depois da guerra russo-japonesa de 1904, os japoneses levaram
// uma boa parte do seu exército vitorioso da Manchúria de volta para a Coréia. Soldados
// japoneses foram alocados em cada cidade e vilarejo. As poucas tropas coreanas foram
// obrigadas a se desfazer e as pessoas comuns a entregarem suas armas. Mesmo aquelas
// rudimentares espingardas usadas pelos montesinos para caçar tigres foram recolhidas
// e queimadas aos montes. Eu mesmo vi seus tambores retorcidos sobre montículos. Um
// tratado foi obtido do governo coreano dando ao Japão absoluto controle dos negócios
// exteriores e virtual controle da administração interna.
// E muito fácil a alguém de fora olhar para estas coisas e observar filosoficamente ser
// inevitável que ou a Rússia ou Japão deveria prevalecer e melhor seria que fosse o Japão
// e não a Rússia. Não é fácil àquele que sofre ver a mão de Deus na miséria. Eu não tenho
// nenhum propósito político ao escrever esta narrativa e estou simplesmente tentando
// mostrar as condições e como estas condições conspiraram para ajudar a providência de
// Deus a levar salvação para a Coréia. A simples verdade é que os coreanos são um povo
// de coração quebrantado. Corrupto e indigno como foi o seu antigo governo, contudo eles
// o amavam e o amavam mais ainda, sem dúvida, ao perceberem que ele lhes fora tomado.
// E doloroso vê-los lamentando e ver homens fortes chorando por causa da perda
// nacional. Eles chegam a nós e dizem: "Existe algum outro país tão pobre, tão infeliz
// como o nosso?" Contudo, existe maior valor no fato de que agora os seus olhos têm sido
// abertos. Antes eles eram orgulhosos e arrogantes; eram "infelizes e miseráveis e pobres
// e cegos e nus" e não sabiam disso. Agora, pelo menos no que se refere a este mundo, eles
// sabem qual é a sua condição. Eles sabem que são desprezados e rejeitados. A flecha
// entrou na alma da Coréia. Seu espírito foi partido. Por anos ela tem estado sentada no
// pó, lamentando não somente o seu infortúnio presente, mas os seus pecados passados.
// E sobre pessoas assim abatidas que Deus muitas vezes tem estendido suas mãos para
// abençoar. Pela contrição do espírito a Coréia tem sido preparada para o Evangelho e
// quando uma outra obra do Espírito de Deus se manifestou, a Escritura novamente se
// cumpriu: "Os sacrifícios agradáveis a Deus são um espírito quebrantado; um coração
// quebrantado e contrito não desprezarás, ó Deus."













