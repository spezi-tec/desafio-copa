<script>
export default {
    props: ['img', 'team']
}
</script>

<template>
    <div class="score-container">
        <div class="score-header">
            <img :src="img" />
            {{ team }}
        </div>
        <div class="score-body">
            <h3>VITÓRIAS</h3>
            <p>34</p>
        </div>
    </div>
</template>

<style scoped>
.score-container {
    width: 264px;

}

.score-header {
    width: 100%;
    height: 50px;
    background-color: #2B2F40;
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 5px;

}

.score-header img {
    width: 25px;
}

.score-body {
    width: 100%;
    height: 124px;
    background-color: #181D27;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}

.score-body h3 {
    color: rgba(248, 248, 248, 0.5);
}
</style>