package ma.aiac.exempleboot;

import org.springframework.stereotype.Service;

@Service("x2")
public class X2 implements X {
    @Override
    public String x() {
        return "x2";
    }
}
