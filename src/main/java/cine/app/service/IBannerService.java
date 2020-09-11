package cine.app.service;

import java.util.List;

import cine.app.model.Banner;

public interface IBannerService {
	public abstract void insertarBanner(Banner banner);
	public abstract List<Banner> buscarTodas();

}
