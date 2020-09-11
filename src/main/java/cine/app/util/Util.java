package cine.app.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class Util {

	/**
	 * Metodo que retorna una lista de String con las fechas
	 * 
	 * @param count
	 * @return
	 */
	public static List<String> getNextDay(int count) {
		List<String> nextDays = null;
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
		try {
			Date start = new Date();
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, count);
			Date end = cal.getTime();

			GregorianCalendar gcal = new GregorianCalendar();
			gcal.setTime(start);

			nextDays = new ArrayList<String>();
			while (!gcal.getTime().after(end)) {
				Date d = gcal.getTime();
				gcal.add(Calendar.DATE, 1);
				nextDays.add(format.format(d));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return nextDays;
	}

	/**
	 * TODO: metodo que guarda la imagen en el servidor
	 * 
	 * @param multipart, request
	 * @return nombreOriginal
	 */
	public static String guardarImage(MultipartFile multipart, HttpServletRequest request)
			throws IOException, Exception {
		try {
			// ==obtiene el nombre del archivo
			String nombreOriginal = multipart.getOriginalFilename();
			nombreOriginal = nombreOriginal.replace(" ", "-");
			// ==renombrar
			String nombreFinal=randomAlphaNumeric(8)+".jpg";
			System.out.print(nombreOriginal);
			// ==obtenemos la ruta absoluta
			String rutaFinal = request.getServletContext().getRealPath("/resources/images/");
			// ==formamos el nombre del archivo para guardarlo en el hdd
			File imageFile = new File(rutaFinal + nombreFinal);
			// aqui se guarda el archivo en el hdd
			//System.out.print(request.getParameterValues("pTitulo"));
			multipart.transferTo(imageFile);
			return nombreFinal;

		} catch (IOException e) {
			// TODO: handle exception
			throw new IOException("IOException en el metodo guardarImage: " + e);

		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Exception en el metodo guardarImage: " + e);
		}
	}

	/**
	 * 
	 */
	public static String randomAlphaNumeric(int count) throws Exception {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder builder = new StringBuilder();
		try {

			while (count-- != 0) {
				int caracter = (int) (Math.random() * caracteres.length());
				builder.append(caracteres.charAt(caracter));
			}

		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Exception al generar nombre random: " + e);
		}
		return builder.toString();
	}

}
