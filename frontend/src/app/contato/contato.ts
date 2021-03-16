import { Arquivo } from "./arquivo";

export class Contato {
    id: number;
    nome: string;
    email: string;
    favorito: boolean;
    arquivo: Arquivo;

    constructor(nome: string, email: string) {
        this.nome = nome;
        this.email = email;
    }
}