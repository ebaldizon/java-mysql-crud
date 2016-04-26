/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionmysql;

/**
 *
 * @author Emanuel
 */
public class Persona {
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int telefono;
    private String correo;
    private String direccion;

    public Persona()
    {}
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id_)
    {
        this.id = id;
    }
    
    public String getNombre()
    {
        return  this.nombre;
    }
    
    public void setNombre(String nombre_)
    {
        this.nombre = nombre_;
    }
    
    public String getPaterno()
    {
        return this.paterno;
    }
    
    public void setPaterno(String paterno_)
    {
        this.paterno = paterno_;
    }
    
    public String getMaterno()
    {
        return this.materno;
    }
    
    public void setMaterno(String materno_)
    {
        this.materno = materno_;
    }
    
    public int getTelefono()
    {
        return telefono;
    }
    
    public void setTelefono(int telefono_)
    {
        this.telefono = telefono;
    }
    
    public String getCorreo()
    {
        return this.correo;
    }
    
    public void setCorreo(String correo_)
    {
        this.correo = correo_;
    }
    
    public String getDireccion()
    {
        return  this.direccion;
    }
    
    public void setDireccion(String direccion_)
    {
        this.direccion = direccion_;
    }
}
