/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import object.deposit;
import object.user;

/**
 *
 * @author Setyawati
 */
public interface implementDeposit {
    public void insert(deposit b);
    
    public deposit get(int deposit_id);
    
    public deposit getByUser(user b);

    public void update(deposit b);

    public void delete(int deposit_id);

    public List<deposit> getAll();
    
    public List<deposit> getCari(int user_id);
    
    public user getUser(deposit b);
    
    public int getCount();
}
