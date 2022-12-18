package cl.subox.ms.aud.domain.entities.address;

import cl.subox.ms.aud.infraestructure.repository.AddressRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddressUseCaseImpl implements AddressUseCase {


    private final AddressRepository addressRepository;


}
