<script>
import newTeamModalVue from '../components/NewTeamModal.vue';

export default {
    components: {
        newTeamModalVue
    },
    data() {
        return {
            newTeamModal: true
        }
    }
}


</script>
<template>

    <div class="main-container">
        <img src="../assets/banner.png">

        <newTeamModalVue v-if="newTeamModal">
            <div class="modal-content">
                <div class="modal-header">
                    <div class="modal-close" @click="newTeamModal = false">x</div>
                    <div class="modal-body">
                        <label>
                            <img src="../assets/upload-banner.png" />
                            <input type="file" id="upload" hidden accept=".jpg, .png" />
                        </label>
                        <div class="form-control">
                            <label for="nome-time">Nome do time</label>
                            <input type="text" id="nome-time">
                        </div>
                        <div class="form-group">
                            <div>
                                <label for="jogadores-defesa">numero de jogadores</label>
                                <input type="text" id="numero-jogadores">
                            </div>
                            <div>
                                <label for="jogadores-defesa">numero de jogadores na defesa</label>
                                <input type="text" id="numero-defesah">
                            </div>
                            <div>
                                <label for="jogadores-defesa">numero de jogadores no ataque</label>
                                <input type="text" id="nome-time">
                            </div>
                            <div>
                                <label for="jogadores-defesa">numero de jogadores no meio de campo</label>
                                <input type="text" id="nome-time">
                            </div>

                        </div>
                        <button>Salvar</button>
                    </div>
                </div>
            </div>
        </newTeamModalVue>

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
    z-index: 1;
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
}

label {
    font-size: 0.8rem;
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
