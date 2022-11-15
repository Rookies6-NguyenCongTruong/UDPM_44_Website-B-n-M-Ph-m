package datn.udpm.service;

import datn.udpm.entity.Account;

public interface AccountService {
	public Account findByEmail(String email);
}
