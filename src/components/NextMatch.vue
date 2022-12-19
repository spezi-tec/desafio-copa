<script>
export default {
    props: ['img', 'team']
}

</script>

<template>
    <div class="match-container">
        <div class="match-box">
            <div class="match-box-header">
                <img :src="img" />
                {{ team }}
            </div>
            <div class="match-box-body">
                <div class="match-stats">
                    <p>PARTIDAS JOGADAS</p>
                    <p>102</p>
                </div>
                <div class="separator"></div>
                <div class="match-stats">
                    <p>VITÓRIAS</p>
                    <p>24</p>
                </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
.match-box {
    width: 590px;
    z-index: -1;
}

.match-box-header img {
    width: 25px;
}

.match-box-header {
    background-color: #2B2F40;
    height: 48px;
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 5px
}

.match-box-body {
    display: flex;
    background-color: #1C212D;
    height: 124px;
    justify-content: center;
    align-items: center;
    gap: 55px;
}

.match-stats {
    width: 100%;
    height: 123px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    color: rgba(248, 248, 248, 0.5);
}

.separator {
    width: 200px;
    height: 0px;

    border: 1px solid rgba(248, 248, 248, 0.2);
    transform: rotate(90deg);
}
</style>