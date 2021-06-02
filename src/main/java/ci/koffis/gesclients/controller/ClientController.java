package ci.koffis.gesclients.controller;

import ci.koffis.gesclients.entity.Client;
import ci.koffis.gesclients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable Long id){
        return clientService.getById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Client> add(@RequestBody Client client){
        return clientService.add(client);
    }
}
