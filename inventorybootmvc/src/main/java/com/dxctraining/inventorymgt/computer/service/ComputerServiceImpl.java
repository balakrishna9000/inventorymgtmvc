package com.dxctraining.inventorymgt.computer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.computer.dao.IComputerDao;
import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.item.entities.Item;

@Transactional
@Service
public class ComputerServiceImpl implements IComputerService{

    @Autowired
    private IComputerDao dao;

    @Override
    public Computer findComputerById(int id) {
       Computer computer= dao.findComputerById(id);
        return computer;
    }


    @Override
    public Computer add(Computer computer) {
    	display(computer);
        computer=dao.add(computer);
        return computer;
    }
    public List<Computer> allComputers() {
		List<Computer>computers=dao.allComputers();
		return computers;
	}

    public void display(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("argument is null");
		}

	}
    
    @Override
    public void remove(int id) {
       dao.remove(id);
    }

  
}