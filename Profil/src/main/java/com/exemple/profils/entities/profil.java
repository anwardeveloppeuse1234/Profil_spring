package com.exemple.profils.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class profil {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idprofil;
    private String nomprofil;
    private String prenomprofil;
    private String email;
    private String numtel;
   @Lob
    private byte[] photo;
	
   public profil() {
	 
	}
	public profil(Long idprofil, String nomprofil, String prenomprofil, String email, String numtel, byte[] photo) {
	super();
	this.idprofil = idprofil;
	this.nomprofil = nomprofil;
	this.prenomprofil = prenomprofil;
	this.email = email;
	this.numtel = numtel;
	this.photo = photo;
}



	public Long getIdprofil() {
		return idprofil;
	}



	public void setIdprofil(Long idprofil) {
		this.idprofil = idprofil;
	}



	public String getNomprofil() {
		return nomprofil;
	}



	public void setNomprofil(String nomprofil) {
		this.nomprofil = nomprofil;
	}



	public String getPrenomprofil() {
		return prenomprofil;
	}



	public void setPrenomprofil(String prenomprofil) {
		this.prenomprofil = prenomprofil;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNumtel() {
		return numtel;
	}



	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}



	public byte[] getPhoto() {
		return photo;
	}



	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}



	@Override
	public String toString() {
		return "profil [idprofil=" + idprofil + ", nomprofil=" + nomprofil + ", prenomprofil=" + prenomprofil
				+ ", email=" + email + ", numtel=" + numtel + "]";
	}


}
