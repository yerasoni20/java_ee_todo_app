package academy.learnprogramming.service;

import academy.learnprogramming.entity.Todo;
import academy.learnprogramming.entity.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Stateless
public class QueryService {

    @Inject
    EntityManager entityManager;

    public User findUserByEmail(String email) {

//TODO
        return entityManager.createNamedQuery(User.FIND_USER_BY_EMAIL, User.class).setParameter("email", email)
                .getResultList().get(0);
    }

    public List countUserByEmail(String email) {
       return entityManager.createNativeQuery("select count (id) from TodoUser where exists (select id from TodoUser where email = ?)"
        ).setParameter(1, email).getResultList();
    }


    public boolean authenticateUser(String email, String password) {

        return false;
    }


    public Todo findTodoById(Long id, String email) {
        List<Todo> resultList = entityManager.createNamedQuery(Todo.FIND_TODO_BY_ID, Todo.class)
                .setParameter("id", id).setParameter("email", email).getResultList();

        if (!resultList.isEmpty()) {
            return resultList.get(0);
        }

        return null;

    }

    public List<Todo> getAllTodos(String email) {

        return entityManager.createNamedQuery(Todo.FIND_ALL_TODOS_BY_USER, Todo.class)
                .setParameter("email", email).getResultList();
    }
}
