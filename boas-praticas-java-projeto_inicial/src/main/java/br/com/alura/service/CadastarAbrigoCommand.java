package br.com.alura.service;

import br.com.alura.Command;
import br.com.alura.client.ClientHttpConfiguration;

import java.io.IOException;

public class CadastarAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
