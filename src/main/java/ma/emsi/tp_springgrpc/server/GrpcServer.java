package ma.emsi.tp_springgrpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.emsi.tp_springgrpc.controllers.CompteServiceimpl;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Construire et démarrer le serveur gRPC
        Server server = ServerBuilder.forPort(9090) // Port du serveur gRPC
                .addService(new CompteServiceimpl()) // Ajouter le service
                .build();

        System.out.println("Serveur gRPC démarré sur le port 9090...");
        server.start();

        // Garder le serveur actif
        server.awaitTermination();
    }
}