/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Cars;

/**
 *
 * @author karab
 */
@Local
public interface CarsFacadeLocal {

    void create(Cars cars);

    void edit(Cars cars);

    void remove(Cars cars);

    Cars find(Object id);

    List<Cars> findAll();

    List<Cars> findRange(int[] range);

    int count();
    
}
