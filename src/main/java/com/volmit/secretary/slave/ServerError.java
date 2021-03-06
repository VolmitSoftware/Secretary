package com.volmit.secretary.slave;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ninja.bytecode.shuriken.web.Parcel;
import ninja.bytecode.shuriken.web.ParcelDescription;
import ninja.bytecode.shuriken.web.ParcelResponse;
import ninja.bytecode.shuriken.web.Parcelable;

@ToString
@EqualsAndHashCode(callSuper = false)
@ParcelResponse("Icarus")
@ParcelDescription("This is a server response usually to another request's error.")
public class ServerError extends Parcel
{
	private static final long serialVersionUID = -6806767374147741101L;

	@Getter
	@Setter
	@ParcelDescription("A human readable description of the error. Useful & Safe to show in-app")
	private String message;

	public ServerError(String message)
	{
		super("error");
		this.message = message;
	}

	public int getStatusHTTPCode()
	{
		// TODO: TEST 500 AND MAKE SURE IT DOESNT BREAK DIO MYGUIDE
		return 500;
	}

	public ServerError()
	{
		this("Unexpected Error");
	}

	@Override
	public Parcelable respond()
	{
		return null;
	}
}
