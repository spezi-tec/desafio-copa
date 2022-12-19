<script>

    export default {
        props:['country', 'img', 'next_match', 'players_num', 'games_played', 'victories', 'defeats']
    }
</script>

<template>
    <div class="score-container">
        <div class="score-head">
            <div>
                <img :src="img"/>
                {{country}}
            </div>
            <div>
                Numero de jogadores
            </div>
            <div>
                partidas jogadas
            </div>
            <div>
                Vitórias
            </div>
            <div>
                Derrotas
            </div>
            <div>
               Ações
            </div>
        </div>
        <div class="score-body">
            <div>
                <span>Próxima Partida</span> : {{next_match}}
            </div>
            <div>
               {{players_num}}
            </div>
            <div>
                {{games_played}}
            </div>
            <div>
                {{victories}}
            </div>
            <div>
              {{defeats}}
            </div>
            <div>
                <img src="../assets/action-icon.png"/>
            </div>
        </div>
    </div>
</template>
<style scoped>
 .score-container {
    margin-top: 30px;
    margin-bottom: 20px;
 }
    .score-head {
        width: 100%;
        height: 50px;
        display: flex;
        justify-content: space-around;
        background-color: #2B2F40;
        align-items: center;
        color: #F8F8F880;
    }
    .score-head div img {
        position: relative;
        top: 4px;
        width: 20px;
    }
    
    .score-body {
        display: flex;
        height: 40px;
        justify-content: space-around;
        align-items: center;
        background-color: #1C212D;
        font-size: 0.8rem;
    
    }
    .score-body div:nth-child(2) {
        position: relative;
        right: 9%;
    }
    .score-body div:nth-child(3) {
        position: relative;
        right: 1.6%;
    }
    .score-body div:nth-child(4) {
        position: relative;
        left: -0.1%;
    }
    .score-body div span {
        color: #F8F8F880;
    }
      
    
</style>