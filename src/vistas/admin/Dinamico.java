package vistas.admin;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import logica.*;
import logica.articulos.*;

@SuppressWarnings("serial")
public class Dinamico extends JPanel {
	private JMenuBar adminMenu;
	private JMenu empleado,producto,salir;
	private JMenu  menuDisco, menuJuguete, menuLibro, menuPelicula;
	public static int ALTASUSUARIO=0,BAJASUSUARIO=1,CAMBIOSUSUARIO=2,ALTASDISCO=3,BAJASDISCO=4,CAMBIOSDISCO=5,ALTASJUGUETE=6,BAJASJUGUETE=7,CAMBIOSJUGUETE=8;
	public static int ALTASLIBRO=9,BAJASLIBRO=10,CAMBIOSLIBRO=11,ALTASPELICULA=12,BAJASPELICULA=13,CAMBIOSPELICULA=14;
	private int estado=ALTASUSUARIO;
	private NuevoUsuario nuevoUsuario;
	private BajaCambiosUsuario bajaCambios;
	
	private Persona p;
	private Usuario u;
	private Juguete juguete;
	private JugueteAlta jugueteAlta;
	private JugueteBaja jugueteBaja;
	private Disco disco;
	private DiscoAlta discoAlta;
	private DiscoBaja discoBaja;
	private Libro libro;
	private LibroAlta libroAlta;
	private LibroBaja libroBaja;
	private Pelicula pelicula;
	private PeliculaAlta peliculaAlta;
	private PeliculaBaja peliculaBaja;
	
	public void salir(){
		estado=ALTASUSUARIO;
		nuevoUsuario.cancelar();
		bajaCambios.cancelar();
		jugueteAlta.cancelar();
		jugueteBaja.cancelar(estado);
		discoAlta.cancelar();
		discoBaja.cancelar(estado);
		libroAlta.cancelar();
		libroBaja.cancelar(estado);
		peliculaAlta.cancelar();
		peliculaBaja.cancelar(estado);
		estados();
	}
	
	public void setUser(Usuario u){
		this.u=u;
		nuevoUsuario.setUser(u);
		bajaCambios.setUser(u);
		
	}
	
	public JMenu getSalir(){return salir;}
	
	public JMenuBar getAdminMenu(){return adminMenu;}
	
	public Dinamico() {
		setBackground(Color.WHITE);
		adminMenu = new JMenuBar();
		empleado = new JMenu("Empleado");
		empleado.add(empleadoAltas);
		empleado.add(empleadoBajas);
		empleado.add(empleadoCambios);
		adminMenu.add(empleado);

		producto = new JMenu("Producto");
		menuDisco = new JMenu("Disco");
		menuDisco.add(altasDisco);
		menuDisco.add(bajasDisco);
		menuDisco.add(cambiosDisco);
		menuJuguete = new JMenu("Jueguete");
		menuJuguete.add(altasJuguete);
		menuJuguete.add(bajasJuguete);
		menuJuguete.add(cambiosJuguete);
		menuLibro = new JMenu("Libro");
		menuLibro.add(altasLibro);
		menuLibro.add(bajasLibro);
		menuLibro.add(cambiosLibro);
		menuPelicula = new JMenu("Pelicula");
		menuPelicula.add(altasPelicula);
		menuPelicula.add(bajasPelicula);
		menuPelicula.add(cambiosPelicula);
		producto.add(menuDisco);
		producto.add(menuJuguete);
		producto.add(menuLibro);
		producto.add(menuPelicula);
		adminMenu.add(producto);
		
		salir = new JMenu("Salir");
		adminMenu.add(salir);

		nuevoUsuario=new NuevoUsuario();
		nuevoUsuario.getAceptar().addActionListener(new Acciones());
		nuevoUsuario.getCancelar().addActionListener(new Acciones());
		nuevoUsuario.setMinimumSize(new Dimension(570,400));
		nuevoUsuario.setMaximumSize(new Dimension(570,400));
		nuevoUsuario.setPreferredSize(new Dimension(570,400));
		add(nuevoUsuario);
		
		bajaCambios=new BajaCambiosUsuario();
		bajaCambios.getAceptar().addActionListener(new Acciones());
		bajaCambios.getCancelar().addActionListener(new Acciones());
		bajaCambios.getSubmit().addActionListener(new Acciones());
		add(bajaCambios);
		
		jugueteAlta = new JugueteAlta();
		jugueteAlta.getAceptar().addActionListener(new Acciones());
		jugueteAlta.getCancelar().addActionListener(new Acciones());
		jugueteAlta.setMinimumSize(new Dimension(570,400));
		jugueteAlta.setMaximumSize(new Dimension(570,400));
		jugueteAlta.setPreferredSize(new Dimension(570,400));
		add(jugueteAlta);
		
		jugueteBaja = new JugueteBaja();
		jugueteBaja.getEliminar().addActionListener(new Acciones());
		jugueteBaja.getCancelar().addActionListener(new Acciones());
		jugueteBaja.getAceptar().addActionListener(new Acciones());
		jugueteBaja.setMinimumSize(new Dimension(570,400));
		jugueteBaja.setMaximumSize(new Dimension(570,400));
		jugueteBaja.setPreferredSize(new Dimension(570,400));
		add(jugueteBaja);
		
		discoAlta = new DiscoAlta();
		discoAlta.getAceptar().addActionListener(new Acciones());
		discoAlta.getCancelar().addActionListener(new Acciones());
		discoAlta.setMinimumSize(new Dimension(570,400));
		discoAlta.setMaximumSize(new Dimension(570,400));
		discoAlta.setPreferredSize(new Dimension(570,400));
		add(discoAlta);
		
		discoBaja = new DiscoBaja();
		discoBaja.getEliminar().addActionListener(new Acciones());
		discoBaja.getCancelar().addActionListener(new Acciones());
		discoBaja.getAceptar().addActionListener(new Acciones());
		discoBaja.setMinimumSize(new Dimension(570,400));
		discoBaja.setMaximumSize(new Dimension(570,400));
		discoBaja.setPreferredSize(new Dimension(570,400));
		add(discoBaja);
		
		libroAlta = new LibroAlta();
		libroAlta.getAceptar().addActionListener(new Acciones());
		libroAlta.getCancelar().addActionListener(new Acciones());
		libroAlta.setMinimumSize(new Dimension(570,400));
		libroAlta.setMaximumSize(new Dimension(570,400));
		libroAlta.setPreferredSize(new Dimension(570,400));
		add(libroAlta);
		
		libroBaja = new LibroBaja();
		libroBaja.getEliminar().addActionListener(new Acciones());
		libroBaja.getCancelar().addActionListener(new Acciones());
		libroBaja.getAceptar().addActionListener(new Acciones());
		libroBaja.setMinimumSize(new Dimension(570,400));
		libroBaja.setMaximumSize(new Dimension(570,400));
		libroBaja.setPreferredSize(new Dimension(570,400));
		add(libroBaja);
		
		peliculaAlta = new PeliculaAlta();
		peliculaAlta.getAceptar().addActionListener(new Acciones());
		peliculaAlta.getCancelar().addActionListener(new Acciones());
		peliculaAlta.setMinimumSize(new Dimension(570,400));
		peliculaAlta.setMaximumSize(new Dimension(570,400));
		peliculaAlta.setPreferredSize(new Dimension(570,400));
		add(peliculaAlta);
		
		peliculaBaja = new PeliculaBaja();
		peliculaBaja.getEliminar().addActionListener(new Acciones());
		peliculaBaja.getCancelar().addActionListener(new Acciones());
		peliculaBaja.getAceptar().addActionListener(new Acciones());
		peliculaBaja.setMinimumSize(new Dimension(570,400));
		peliculaBaja.setMaximumSize(new Dimension(570,400));
		peliculaBaja.setPreferredSize(new Dimension(570,400));
		add(peliculaBaja);
		
		estados();
	}
	
	public class Acciones implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nuevoUsuario.getAceptar()){ 
				if(!nuevoUsuario.checkTextFields()){
					Object[] options = {"Si","No"};
					int n = JOptionPane.showOptionDialog(null,"Esta seguro de dar de alta?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
					if(n==0){
						int error;
						error=u.agregarUsuario( nuevoUsuario.getPersona() );
						if(error==Usuario.EREPETIDO){
							nuevoUsuario.repetido(true);
						}else if(error==Usuario.ECONEXION){
							System.out.println("Error en la conexion");
						}
						else if(error==0){
							nuevoUsuario.cancelar();
							nuevoUsuario.exito();
						}
					}			
				}
			}
			else if(e.getSource() == nuevoUsuario.getCancelar()) {
				nuevoUsuario.cancelar();
			}
			//baja y cambios de usuario
			else if(e.getSource() == bajaCambios.getAceptar()){
				if(!bajaCambios.getNombreUsuario().equals("")){
					bajaCambios.nuevo();
					p=u.obtenerInfo(bajaCambios.getNombreUsuario());
					if(p==null){
						bajaCambios.setError(2);
						bajaCambios.nuevo();
					}
					else if(p.getNombre()==null){
						bajaCambios.setError(3);
						bajaCambios.nuevo();
						p=null;
					}
					else{
						bajaCambios.cargarDatos(p);
						bajaCambios.setError(0);
					}	
				}
				else{
					bajaCambios.setError(1);
					bajaCambios.nuevo();
					p=null;
				}
			}
			else if(e.getSource() == bajaCambios.getSubmit()){
				if(!bajaCambios.checkTextFields()&&p!=null){
					if(bajaCambios.getNombreUsuario().equals(p.getNombreUsuario())){
						if(bajaCambios.getEstado()==BAJASUSUARIO){
							if( bajaCambios.getNombreUsuario().equals(u.getNombreUsuario()) ){
								bajaCambios.setError(4);
								bajaCambios.nuevo();
							}
							else{
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de eliminar?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								if(n==0&&u.eliminarUsuario(p)){
									bajaCambios.cancelar();
									bajaCambios.exito();
								}
							}
						}
						else if(bajaCambios.getEstado()==CAMBIOSUSUARIO){
							if( bajaCambios.getTipo()!=p.getTipo() && bajaCambios.getNombreUsuario().equals(u.getNombreUsuario()) ){
								bajaCambios.setError(4);
								bajaCambios.nuevo();
							}
							else{
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de los cambios?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								Persona nueva=bajaCambios.getPersona();
								if(n==0&&u.cambiarUsuario(nueva)){
									bajaCambios.cancelar();
									bajaCambios.exito();
								}
							}
						}
					}
					else{
						bajaCambios.setError(3);
						bajaCambios.nuevo();
					}
				}
				else{
					bajaCambios.setError(4);
					bajaCambios.nuevo();
				}
			}
			else if(e.getSource() == bajaCambios.getCancelar()){
				bajaCambios.cancelar();
			}else if(e.getSource() == discoAlta.getAceptar()){
				if(!discoAlta.checkTextFields()){
					Object[] options = {"Si","No"};
					int n = JOptionPane.showOptionDialog(null,"Esta seguro de dar de alta?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
					if(n==0){
						int error;
						error=u.agregarDisco( discoAlta.getDisco() );
						if(error==Usuario.EREPETIDO){
							discoAlta.repetido(true);
						}else if(error==Usuario.ECONEXION){
							System.out.println("Error en la conexion");
						}
						else if(error==0){
							discoAlta.cancelar();
							discoAlta.exito();
						}
					}	
				}
			}else if(e.getSource() == discoAlta.getCancelar()){
				discoAlta.cancelar();
			}else if(e.getSource() == discoBaja.getEliminar()){
				if(!discoBaja.checkTextFields()&&disco!=null){
					if(discoBaja.getNombreDisco().equals(disco.getNombre())){
						if(estado == BAJASDISCO){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de eliminar?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								if(n==0&&u.eliminarDisco(disco)){
									discoBaja.cancelar(estado);
									discoBaja.exito(BAJASDISCO);
								}
						}
						else if(estado == CAMBIOSDISCO){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de los cambios?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								Disco nueva=discoBaja.getDisco();
								if(n==0&&u.cambiarDisco(nueva)){
									discoBaja.cancelar(estado);
									discoBaja.exito(CAMBIOSDISCO);
								}
						}
					}
					else{
						discoBaja.setError(4);
						discoBaja.cancelar(estado);
					}
				}
				else{
					discoBaja.setError(4);
					discoBaja.cancelar(estado);
				}
			}else if(e.getSource() == discoBaja.getAceptar()){
				if(!discoBaja.getNombreDisco().equals("")){
					disco=u.obtenerInfoDisco(discoBaja.getNombreDisco());
					if(disco==null){
						discoBaja.setError(2);
						discoBaja.cancelar(estado);
					}
					else{
						discoBaja.cargarDatos(disco);
						discoBaja.setError(0);
					}	
				}
				else{
					discoBaja.setError(1);
					discoBaja.cancelar(estado);
					disco=null;
				}
			}else if(e.getSource() == discoBaja.getCancelar()){
				discoBaja.cancelar(estado);
			}else if(e.getSource() == jugueteAlta.getAceptar()){
				if(!jugueteAlta.checkTextFields()){
					Object[] options = {"Si","No"};
					int n = JOptionPane.showOptionDialog(null,"Esta seguro de dar de alta?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
					if(n==0){
						int error;
						error=u.agregarJuguete( jugueteAlta.getJuguete() );
						if(error==Usuario.EREPETIDO){
							jugueteAlta.repetido(true);
						}else if(error==Usuario.ECONEXION){
							System.out.println("Error en la conexion");
						}
						else if(error==0){
							jugueteAlta.cancelar();
							jugueteAlta.exito();
						}
					}
				}
			}else if(e.getSource() == jugueteAlta.getCancelar()){
				jugueteAlta.cancelar();
			}else if(e.getSource() == jugueteBaja.getEliminar()){
				if(!jugueteBaja.checkTextFields()&&juguete!=null){
					if(jugueteBaja.getNombreJuguete().equals(juguete.getNombre())){
						if(estado == BAJASJUGUETE){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de eliminar?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								if(n==0&&u.eliminarJuguete(juguete)){
									jugueteBaja.cancelar(estado);
									jugueteBaja.exito(BAJASJUGUETE);
								}
						}
						else if(estado == CAMBIOSJUGUETE){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de los cambios?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								Juguete nueva=jugueteBaja.getJuguete();
								if(n==0&&u.cambiarJuguete(nueva)){
									jugueteBaja.cancelar(estado);
									jugueteBaja.exito(CAMBIOSJUGUETE);
								}
						}
					}
					else{
						jugueteBaja.setError(4);
						jugueteBaja.cancelar(estado);
					}
				}
				else{
					jugueteBaja.setError(4);
					jugueteBaja.cancelar(estado);
				}
			}else if(e.getSource() == jugueteBaja.getAceptar()){
				if(!jugueteBaja.getNombreJuguete().equals("")){
					juguete=u.obtenerInfoJuguete(jugueteBaja.getNombreJuguete());
					if(juguete==null){
						jugueteBaja.setError(2);
						jugueteBaja.cancelar(estado);
					}
					else if(juguete.getNombre()==null){
						jugueteBaja.setError(3);
						jugueteBaja.cancelar(estado);
						disco=null;
					}
					else{
						jugueteBaja.cargarDatos(juguete);
						jugueteBaja.setError(0);
					}	
				}
				else{
					jugueteBaja.setError(1);
					jugueteBaja.cancelar(estado);
					juguete=null;
				}
			}else if(e.getSource() == jugueteBaja.getCancelar()){
				jugueteBaja.cancelar(estado);
			}else if(e.getSource() == libroAlta.getAceptar()){
				if(!libroAlta.checkTextFields()){
					Object[] options = {"Si","No"};
					int n = JOptionPane.showOptionDialog(null,"Esta seguro de dar de alta?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
					if(n==0){
						int error;
						error=u.agregarLibro( libroAlta.getLibro() );
						if(error==Usuario.EREPETIDO){
							libroAlta.repetido(true);
						}else if(error==Usuario.ECONEXION){
							System.out.println("Error en la conexion");
						}
						else if(error==0){
							libroAlta.cancelar();
							libroAlta.exito();
						}
					}
				}
			}else if(e.getSource() == libroAlta.getCancelar()){
				libroAlta.cancelar();
			}else if(e.getSource() == libroBaja.getEliminar()){
				if(!libroBaja.checkTextFields()&&libro!=null){
					if(libroBaja.getNombreLibro().equals(libro.getNombre())){
						if(estado == BAJASLIBRO){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de eliminar?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								if(n==0&&u.eliminarLibro(libro)){
									libroBaja.cancelar(estado);
									libroBaja.exito(BAJASLIBRO);
								}
						}
						else if(estado == CAMBIOSLIBRO){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de los cambios?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								Libro nueva=libroBaja.getLibro();
								if(n==0&&u.cambiarLibro(nueva)){
									libroBaja.cancelar(estado);
									libroBaja.exito(CAMBIOSLIBRO);
								}
						}
					}
					else{
						libroBaja.setError(4);
						libroBaja.cancelar(estado);
					}
				}
				else{
					libroBaja.setError(4);
					libroBaja.cancelar(estado);
				}
			}else if(e.getSource() == libroBaja.getAceptar()){
				if(!libroBaja.getNombreLibro().equals("")){
					libro=u.obtenerInfoLibro(libroBaja.getNombreLibro());
					if(libro==null){
						libroBaja.setError(2);
						libroBaja.cancelar(estado);
					}
					else if(libro.getNombre()==null){
						libroBaja.setError(3);
						libroBaja.cancelar(estado);
						libro=null;
					}
					else{
						libroBaja.cargarDatos(libro);
						libroBaja.setError(0);
					}	
				}
				else{
					libroBaja.setError(1);
					libroBaja.cancelar(estado);
					libro=null;
				}
			}else if(e.getSource() == libroBaja.getCancelar()){
				libroBaja.cancelar(estado);
			}else if(e.getSource() == peliculaAlta.getAceptar()){
				if(!peliculaAlta.checkTextFields()){
					Object[] options = {"Si","No"};
					int n = JOptionPane.showOptionDialog(null,"Esta seguro de dar de alta?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
					if(n==0){
						int error;
						error=u.agregarPelicula( peliculaAlta.getPelicula() );
						if(error==Usuario.EREPETIDO){
							peliculaAlta.repetido(true);
						}else if(error==Usuario.ECONEXION){
							System.out.println("Error en la conexion");
						}
						else if(error==0){
							peliculaAlta.cancelar();
							peliculaAlta.exito();
						}
					}
				}
			}else if(e.getSource() == peliculaAlta.getCancelar()){
				peliculaAlta.cancelar();
			}else if(e.getSource() == peliculaBaja.getEliminar()){
				if(!peliculaBaja.checkTextFields()&&pelicula!=null){
					if(peliculaBaja.getNombrePelicula().equals(pelicula.getNombre())){
						if(estado == BAJASPELICULA){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de eliminar?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								if(n==0&&u.eliminarPelicula(pelicula)){
									peliculaBaja.cancelar(estado);
									peliculaBaja.exito(BAJASPELICULA);
								}
						}
						else if(estado == CAMBIOSPELICULA){
								Object[] options = {"Si","No"};
								int n = JOptionPane.showOptionDialog(null,"Esta seguro de los cambios?","Confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
								Pelicula nueva=peliculaBaja.getPelicula();
								if(n==0&&u.cambiarPelicula(nueva)){
									peliculaBaja.cancelar(estado);
									peliculaBaja.exito(CAMBIOSPELICULA);
								}
						}
					}
					else{
						peliculaBaja.setError(4);
						peliculaBaja.cancelar(estado);
					}
				}
				else{
					peliculaBaja.setError(4);
					peliculaBaja.cancelar(estado);
				}
			}else if(e.getSource() == peliculaBaja.getAceptar()){
				if(!peliculaBaja.getNombrePelicula().equals("")){
					pelicula=u.obtenerInfoPelicula(peliculaBaja.getNombrePelicula());
					if(pelicula==null){
						peliculaBaja.setError(2);
						peliculaBaja.cancelar(estado);
					}
					else if(pelicula.getNombre()==null){
						peliculaBaja.setError(3);
						peliculaBaja.cancelar(estado);
						pelicula=null;
					}
					else{
						peliculaBaja.cargarDatos(pelicula);
						peliculaBaja.setError(0);
					}	
				}
				else{
					peliculaBaja.setError(1);
					peliculaBaja.cancelar(estado);
					pelicula=null;
				}
			}else if(e.getSource() == peliculaBaja.getCancelar()){
				peliculaBaja.cancelar(estado);
			}
		}
	}
	
	public void estados(){
		if(estado == ALTASUSUARIO){
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			nuevoUsuario.cancelar();
			nuevoUsuario.setVisible(true);
		}
		else if(estado==BAJASUSUARIO){
			nuevoUsuario.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			bajaCambios.setBajas();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == CAMBIOSUSUARIO){
			nuevoUsuario.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			bajaCambios.setCambios();
			bajaCambios.cancelar();
			bajaCambios.setVisible(true);
		}else if(estado == ALTASDISCO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			discoAlta.cancelar();
			discoAlta.setVisible(true);
		}else if(estado == BAJASDISCO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			discoBaja.setBajas();
			discoBaja.cancelar(estado);
			discoBaja.setVisible(true);
		}else if(estado == CAMBIOSDISCO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			discoBaja.setCambios();
			discoBaja.cancelar(estado);
			discoBaja.setVisible(true);
		}else if(estado == ALTASJUGUETE){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			jugueteAlta.cancelar();
			jugueteAlta.setVisible(true);
		}else if(estado == BAJASJUGUETE){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			jugueteBaja.setBajas();
			jugueteBaja.cancelar(estado);
			jugueteBaja.setVisible(true);
		}else if(estado == CAMBIOSJUGUETE){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			jugueteBaja.setCambios();
			jugueteBaja.cancelar(estado);
			jugueteBaja.setVisible(true);
		}else if(estado == ALTASLIBRO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			libroAlta.cancelar();
			libroAlta.setVisible(true);
		}else if(estado == BAJASLIBRO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			libroBaja.setBajas();
			libroBaja.cancelar(estado);
			libroBaja.setVisible(true);
		}else if(estado == CAMBIOSLIBRO){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setVisible(false);
			libroBaja.setCambios();
			libroBaja.cancelar(estado);
			libroBaja.setVisible(true);
		}else if(estado == ALTASPELICULA){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaBaja.setVisible(false);
			peliculaAlta.cancelar();
			peliculaAlta.setVisible(true);
		}else if(estado == BAJASPELICULA){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setBajas();
			peliculaBaja.cancelar(estado);
			peliculaBaja.setVisible(true);
		}else if(estado == CAMBIOSPELICULA){
			nuevoUsuario.setVisible(false);
			bajaCambios.setVisible(false);
			discoAlta.setVisible(false);
			discoBaja.setVisible(false);
			jugueteAlta.setVisible(false);
			jugueteBaja.setVisible(false);
			libroAlta.setVisible(false);
			libroBaja.setVisible(false);
			peliculaAlta.setVisible(false);
			peliculaBaja.setCambios();
			peliculaBaja.cancelar(estado);
			peliculaBaja.setVisible(true);
		}
	}
	
	Action empleadoAltas = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASUSUARIO;
			estados();
		}
	};	
	Action empleadoBajas = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASUSUARIO;
			estados();
		}
	};
	Action empleadoCambios = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSUSUARIO;
			estados();
		}
	};
	
	Action altasDisco = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASDISCO;
			estados();
		}
	};
	
	Action bajasDisco = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASDISCO;
			estados();
		}
	};
	Action cambiosDisco = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSDISCO;
			estados();
		}
	};
	
	Action altasJuguete = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASJUGUETE;
			estados();
		}
	};
	Action bajasJuguete = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASJUGUETE;
			estados();
		}
	};
	Action cambiosJuguete = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSJUGUETE;
			estados();
		}
	};
	
	
	Action altasLibro = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASLIBRO;
			estados();
		}
	};
	
	Action bajasLibro = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASLIBRO;
			estados();
		}
	};
	Action cambiosLibro = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSLIBRO;
			estados();
		}
	};
	
	Action altasPelicula = new AbstractAction("Altas") {
		public void actionPerformed(ActionEvent e) {
			estado = ALTASPELICULA;
			estados();
		}
	};
	
	Action bajasPelicula = new AbstractAction("Bajas") {
		public void actionPerformed(ActionEvent e) {
			estado = BAJASPELICULA;
			estados();
		}
	};
	
	Action cambiosPelicula = new AbstractAction("Cambios") {
		public void actionPerformed(ActionEvent e) {
			estado = CAMBIOSPELICULA;
			estados();
		}
	};
}
