package ma.aiac.exempleboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class X1 implements X {
    @Override
    public String x() {
        return "x1";
    }
}
