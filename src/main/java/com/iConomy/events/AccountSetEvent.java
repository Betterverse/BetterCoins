package com.iConomy.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountSetEvent extends Event {

	private final String account;
	private double balance;
	private HandlerList handlers = new HandlerList();

	public AccountSetEvent(String account, double balance) {
		this.account = account;
		this.balance = balance;
	}

	public String getAccountName() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
}
