package net.pubnative.library;

import org.junit.Test;

public class DumbObjectTest {

    @Test
    public void property_atStart_isNull() {
        DumbObject object = new DumbObject();
        assert object.getProperty() == null;
    }

    @Test
    public void property_whenSet_returnsThatValue() {
        DumbObject object = new DumbObject();
        object.setProperty("hola");
        assert object.getProperty() == "hola";
    }
}
