<script>
import Modal from '../components/Modal.vue';
import NextMatch from '../components/NextMatch.vue'
import ScoreCard from '../components/ScoreCard.vue'
import db from '../../db/teams'
export default {
    components: {
        NextMatch,
        Modal,
        ScoreCard
    },
    created() {
        this.teams = db
    },
    data() {
        return {
            teams: [],
            sortMatchModal: false,
            selectedTeam: null,
            loading: false,
            nextMatch: false,
        }
    },
    methods: {
        handleSortModalClose() {
            this.sortMatchModal = false
        },
        handleTeamSort() {
            this.handleSortModalClose()
            this.loading = true
            setTimeout(() => {
                this.loading = false
                this.nextMatch = true
            }, 3000)
        },
        OnChangeTeam(e) {
            this.selectedTeam = e.target.value
        }, 
        handleMatchClose(){
            this.nextMatch = false
        }
    }

}
</script>

<template>
    <div>
        <div class="main-header">
            <h3>PRÓXIMAS PARTIDAS</h3>
            <button @click="sortMatchModal = true">
                <img src="../assets/flag.png" />
                SORTEAR UMA PARTIDA
            </button>
        </div>
        <Modal :isOpen="sortMatchModal" @close="handleSortModalClose">
            <div class="sort-modal">
                <div class="sort-modal-head">
                    <button @click="handleSortModalClose">x</button>
                </div>
                <div class="sort-modal-body">
                    <div>
                        <label for="id">Selecione um time da sua base</label>
                        <select id="sort" @change="OnChangeTeam">
                            <option>Selecione um time</option>
                            <option v-for="team in teams" :value="team.pais">{{ team.pais }}</option>
                        </select>
                    </div>
                </div>
                <div class="sort-modal-footer">
                    <button @click="handleTeamSort">SORTEAR</button>
                </div>
            </div>
        </Modal>
        <div class="date">
            <p>20 de dezembro de 2022</p>
        </div>
        <div class="match-container">

            <div class="team-1">
                <NextMatch 
                img="https://cdn-icons-png.flaticon.com/512/197/197386.png"
                team="Brasil"
                />
            </div>

            <div class="versus">
                <p>x</p>
            </div>
            <div class="team-2">
                <NextMatch 
                img="https://cdn-icons-png.flaticon.com/512/197/197573.png"
                team="Argentina"/>
            </div>
        </div>
        <div class="date">
            <p>20 de dezembro de 2022</p>
        </div>
        <div class="match-container">

            <div class="team-1">
                <NextMatch
                img="https://cdn-icons-png.flaticon.com/512/197/197551.png" 
                team="Marrocos"
                />
            </div>

            <div class="versus ">
                <p>x</p>
            </div>
            <div class="team-2">
                <NextMatch 
                img="https://cdn-icons-png.flaticon.com/512/197/197386.png"
                team="Brasil"
                />
            </div>
        </div>
    </div>
    <Modal :isOpen="nextMatch" @close="handleMatchClose">
        <div class="next-match-container">
            <div class="next-match-header">
                <button @click="nextMatch = false">x</button>
            </div>
            <div class="next-match-body">
                <h3>SUA PRÓXIMA PARTIDA SERA EM:</h3>
                <p>20 DE DEZEMBRO DE 2022</p>
            </div>
            <div class="matchs">
           <div class="team-1">
            <ScoreCard 
            img="https://cdn-icons-png.flaticon.com/512/197/197386.png"
            team="Brasil"
            />
           </div>
             <div class="versus">
                <p>x</p>
             </div>
             <div class="team-2">
                <ScoreCard
                img="https://cdn-icons-png.flaticon.com/512/197/197573.png"
                team="Argentina"
                />
             </div>
            </div>
            <div class="next-match-footer">
                <button @click="nextMatch = false">VER PARTIDAS</button>
            </div>
        </div>
    </Modal>
    <Modal :isOpen="loading">
        <div class="loading-modal">
            <div class="loading-modal-head">
                <button @click="loading = false">x</button>
            </div>
            <div class="loading-content">
                <h3>SORTEANDO RIVAIS E DATAS</h3>
                <p>Isso pode demorar um pouco</p>
                <div class="progress-bar">
                    <div class="progress-status">
                    </div>
                </div>
            </div>
            <div class="loading-modal-footer">
                <button @click="loading = false">CANCELAR</button>
            </div>
        </div>
    </Modal>
</template>
<style>
.main-header {
    display: flex;
    width: 100%;
    justify-content: space-between;
    margin: 20px 0px 20px 0px;
}

.main-header button {
    background-color: #F5760F;
    border: none;
    width: 270px;
    height: 40px;
    color: #fff;
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 10px;
    font-weight: bold;
}
.main-header button:hover {
    background-color: #FFC300;
    transition: ease .5s;
}

.date {
    background-color: #121219;
    color: rgba(248, 248, 248, 0.5);
    height: 48px;
    display: flex;
    align-items: center;
    justify-content: center;
}

.match-container {
    display: flex;
    margin-top: 20px;
    margin-bottom: 20px;

}


.versus {
    position: relative;
    top: 5px;
    right: 10px;
}

.versus p {
    color: #F5760F;
    font-size: 3.9rem;
}

.team-2 {
    position: relative;
    right: 18px;
}

.team-1 {
    position: relative;
    left: 3px;
}

.sort-modal {
    width: 592px;
    height: 230px;
    background-color: #1C212D;
    z-index: 100000;
}

.sort-modal-head button {
    position: relative;
    left: 565px;
    top: 6px;
    background-color: #1C212D;
    border: none;
    color: #fff;
    cursor: pointer;
}
.sort-modal-footer button:hover {
    background-color: #FFC300;
    transition: ease-in .2s;
}

.sort-modal-body {
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 0px 45px;
    margin-top: 55px;
}

.sort-modal-body select {
    width: 500px;
    background: transparent;
    -webkit-appearance: none;
    appearance: none;
    color: rgba(255, 255, 255, 0.2);
    border-radius: 4px;
    margin-top: 5px;
    background: url('../assets/select.png') no-repeat right #2B2F40;
    padding: 10px;
    border: none;
    border-right: 16px solid transparent
}

.sort-modal-body label {
    color: #F8F8F8;
    font-size: 0.9rem;
}

.sort-modal-footer {
    display: flex;
    align-items: center;
    justify-content: center;
    margin-top: 20px;
}

.sort-modal-footer button {
    width: 84.6%;
    height: 30px;
    background-color: #F5760F;
    border: none;
    border-radius: 4px;
    color: #fff;
    font-weight: bold;

}

.loading-modal {
    width: 293px;
    height: 233px;
    background-color: #1C212D;
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 0px 25px;
    border-radius: 4px;
    flex-direction: column;
}

.loading-content p {
    color: rgba(255, 255, 255, 0.4);
    font-size: 0.7rem;
    text-align: center;
}

.progress-bar {
    width: 100%;
    height: 8px;
    background-color: #2B2F40;
    border-radius: 2px;
}

.progress-status {
    height: 8px;
    background-color: #F5760F;
    border-radius: 2px;
    animation: progress 5000ms;
}

.loading-modal-footer {
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
}

.loading-modal-footer button {
    width: 89.5%;
    margin-top: 20px;
    height: 30px;
    background-color: #F5760F;
    border: none;
    border-radius: 4px;
    color: #fff;
    font-weight: bold;

}
.loading-modal-footer button:hover {
    background-color: #FFC300;
    transition: ease-in .2s;
}

.loading-modal-head button {
    position: relative;
    left: 155px;
    bottom: 25px;
    background-color: transparent;
    border: none;
    color: #fff;
    font-size: 1.2rem;
    cursor: pointer;
}

.next-match-container {
    width: 601px;
    height: 454px;
    background-color: #121219;
    border-radius: 4px;
}

.next-match-header button {
    position: relative;
    left: 570px;
    bottom: -7px;
    background-color: transparent;
    border: none;
    color: #fff;
    font-size: 1.2rem;
    cursor: pointer;
}

.next-match-body {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
}

.next-match-body p {
    font-size: 0.8rem;
    color: rgba(255, 255, 255, 0.2);
}
.matchs {
    display: flex;
    justify-content: center;
}
.matchs .versus {
    z-index: 1;
}
.matchs .versus p {
    position: relative;
    top:-25px;
}
.next-match-footer {
    width: 100%;
    display: flex;
    justify-content: center;
   
}
.next-match-footer button {
    background-color: #F5760F;
    border: none;
    width: 91%;
    height: 30px;
    margin-right: 25px;
    color: #fff;
    font-weight: bold;
    border-radius: 4px;
    margin-top: 20px;

}
.next-match-footer button:hover {
    background-color: #FFC300;
    transition: ease-in .2s;
}

@keyframes progress {
    0% {
        width: 0%;
    }

    100% {
        width: 100%;
    }
}
</style>