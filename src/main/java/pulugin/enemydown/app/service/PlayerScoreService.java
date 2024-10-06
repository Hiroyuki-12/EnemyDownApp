package pulugin.enemydown.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pulugin.enemydown.app.mapper.PlayerScoreMapper;
import pulugin.enemydown.app.mapper.data.GameConfig;
import pulugin.enemydown.app.mapper.data.PlayerScore;

import java.util.List;

@Service
public class PlayerScoreService {

    private final PlayerScoreMapper mapper;

    public PlayerScoreService(PlayerScoreMapper mapper) {
        this.mapper = mapper;
    }

    public List<PlayerScore> searchPlayerScoreList() {
        return mapper.selectPlayerScoreList();
    }

}
