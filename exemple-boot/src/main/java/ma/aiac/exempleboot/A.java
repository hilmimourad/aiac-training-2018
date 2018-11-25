package ma.aiac.exempleboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

    @Autowired
    X x;

    String doSomething() {
        return x.x();
    }
}
