package com.dream.codechallenge.resources;

import com.dream.codechallenge.domain.Account;

public @interface ApiOperation {

	String value();

	Class<Account> response();

}
