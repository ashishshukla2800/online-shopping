package net.kzn.shoppingbackendGit.dao;

import java.util.List;

import net.kzn.shoppingbackendGit.dto.Category;

public interface CategoryDAO {

	List <Category> list();
	Category get(int id);
}
