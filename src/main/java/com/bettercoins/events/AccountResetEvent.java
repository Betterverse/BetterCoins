package com.bettercoins.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountResetEvent extends Event {
    private final String account;
    private boolean cancelled = false;
		private HandlerList handlers = new HandlerList();

    public AccountResetEvent(String account) {
        this.account = account;
    }

    public String getAccountName() {
        return account;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
		@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	@Override
	public String getEventName() {
		return "ACCOUNT RESET";
	}
}

