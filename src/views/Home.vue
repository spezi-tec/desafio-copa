<script>
import Modal from '../components/Modal.vue';
import ScoreBoard from '../components/ScoreBoard.vue';
import db from '../../db/teams'
export default {
    components: {
        Modal,
        ScoreBoard
    },
    data() {
        return {
            handleModalOpen: false,
            teams: [],
            form: {
                img_team: "",
                team_name: "",
                player_num: "",
                defense_num: "",
                attack_num: "",
                half_num: ""


            }

        }
    },
    methods: {
        handleModalClose() {
            this.handleModalOpen = false
        },
        submitTeam() {
            console.log(this.form)

            const obj = {
                pais: this.form.team_name,
                numero_jogadores: this.form.player_num,
                partidas_jogadas: 102,
                vitorias: 53,
                derrotas: 22,
                img_path: `https://cdn-icons-png.flaticon.com/512/5921/${this.form.img_team}`,
                proxima_partida: "01/01/2023"
            }
            this.teams.push(obj)
        },
        handleTeamImageSubmit(e) {
            this.form.img_team = e.target.files[0].name
        }
    },
    created() {
        this.teams = db
    }

}



</script>
<template>

    <div class="main-container">
        <img src="../assets/banner.png">

        <Modal :isOpen="handleModalOpen" @close="handleModalClose">
            <div class="modal-content">
                <div class="modal-header">
                    <div class="modal-close" @click="handleModalOpen = false">x</div>
                    <div class="modal-body">
                        <label>
                            <img src="../assets/upload-banner.png" />
                            <input type="file" id="upload" hidden accept=".jpg, .png"
                                :onChange="handleTeamImageSubmit" />
                        </label>
                        <div class="form-control">
                            <label for="nome-time">Nome do time</label>
                            <input type="text" id="nome-time" v-model="form.team_name">
                        </div>
                        <div class="form-group">
                            <div>
                                <label for="jogadores-defesa">numero de jogadores</label>
                                <input type="text" id="numero-jogadores" v-model="form.player_num">
                            </div>
                            <div>
                                <label for="jogadores-defesa">numero de jogadores na defesa</label>
                                <input type="text" id="numero-defesa" v-model="form.defense_num">
                            </div>
                            <div>
                                <label for="jogadores-defesa">numero de jogadores no ataque</label>
                                <input type="text" id="nome-time" v-model="form.attack_num">
                            </div>
                            <div>
                                <label for="jogadores-defesa">numero de jogadores no meio de campo</label>
                                <input type="text" id="nome-time" v-model="form.half_num">
                            </div>

                        </div>
                        <button @click="submitTeam">Salvar</button>
                    </div>
                </div>
            </div>
        </Modal>
        <div class="section-header">
            <h3>MEUS TIMES</h3>
            <button @click="handleModalOpen = true">
                <img src="../assets/plus-btn.png" />
                NOVO TIME
            </button>
        </div>

        <div v-for="team in teams">
            <ScoreBoard :next_match="team.proxima_partida" :players_num="team.numero_jogadores"
                :games_played="team.partidas_jogadas" :img="team.img_path" :victories="team.vitorias"
                :defeats="team.derrotas" :country="team.pais" />
        </div>
    </div>

</template>

<style scoped>
.main-container {
    width: 1193px;
    margin: 0 auto;

}

.modal-content {
    width: 592px;
    height: 588px;
    background-color: #1C212D;
    border-radius: 6px;
    position: relative;
    z-index: 1000;
    animation: modalEffect 500ms;
}

.modal-close {
    position: absolute;
    left: 94.5%;
    top: 5px;
    width: 25px;
    height: 25px;
    display: flex;
    align-items: center;
    justify-content: center;
    cursor: pointer;
}

.modal-body {
    display: flex;
    flex-direction: column;
    justify-content: center;
    gap: 20px;
    padding: 0px 40px;
}

.modal-body img {
    margin-top: 60px;
    cursor: pointer;
}

.form-control {
    display: flex;
    flex-direction: column;
}

.modal-body button {
    background-color: #F5760F;
    color: #fff;
    border: none;
    height: 45px;
    font-weight: 800;
    margin-top: 30px;
}

.form-group {
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    gap: 20px;
}

.form-group input {
    width: 240px;
}

input {
    background-color: #191B25;
    border: 1px solid #191B25;
    height: 35px;
    margin-top: 7px;
    border-radius: 4px;
    color: rgba(255, 255, 255, 0.2);
}

label {
    font-size: 0.8rem;
}

.section-header {
    width: 100%;
    margin-top: 50px;
    display: flex;
    justify-content: space-between;

}

.section-header button {
    background-color: #F5760F;
    width: 150px;
    height: 40px;
    color: #fff;
    display: flex;
    align-items: center;
    gap: 20px;
    font-weight: bold;

}

@keyframes modalEffect {
    from {
        opacity: 0;
    }

    to {
        opacity: 1;
    }
}
</style>
