package org.springframework.samples.sieteislas.player;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.sieteislas.user.User;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	private PlayerRepository playerRepository;

	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

    public Player findByUser(User user) {
		return this.playerRepository.findPlayerByUser(user);
	}

    public void save(@Valid Player player) {
		this.playerRepository.save(player);
	}

}