package cl.subox.ms.aud.domain.entities.user;

import cl.subox.ms.aud.domain.entities.role.Role;
import cl.subox.ms.aud.infraestructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


    @RequiredArgsConstructor
    public class UserUseCase implements IUserUseCase {

        private final UserRepository userRepository;


        @Override
        public User saveUser(User user) {
            return null;
        }

        @Override
        public void addRoleToUserByUserName(String userName, Role role) {

        }

        @Override
        public void addRoleToUserByEmail(String email, Role role) {

        }

        @Override
        public void addRoleToUserById(Long id, Role role) {

        }

        @Override
        public User getUserById(Long id) {
            return null;
        }

        @Override
        public User getUserByUserName(String userName) {
            return null;
        }

        @Override
        public User getUserByEmail(String email) {
            return null;
        }

        @Override
        public Boolean validUserForRegisterLocal(User user) {
            return null;
        }
    }
