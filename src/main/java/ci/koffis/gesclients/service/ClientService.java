package ci.koffis.gesclients.service;

import ci.koffis.gesclients.entity.Client;
import ci.koffis.gesclients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ResponseEntity<Client> getById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        if (client.isPresent()){
            return new ResponseEntity<Client>(client.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
}
