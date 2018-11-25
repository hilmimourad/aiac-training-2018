package ma.aiac.exempleboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class B {

    @Autowired @Qualifier("x2")
    X x;

    String doSomething() {
        return x.x();
    }
}
