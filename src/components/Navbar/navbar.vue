

<template>
    <div class="nav-container">
        <p class="logo">MEU<span>TIME</span></p>

        <ul>
            <router-link to="/partidas">
                <li>PARTIDAS</li>
            </router-link>
       
            <router-link to="/">
                <li>MEUS TIMES</li>
            </router-link>
            <a href="">
                <li>COMUNIDADE</li>
            </a>
            <a href="">
                <li>NOVIDADES</li>
            </a>
        </ul>

        <div class="user-section">
            <span class="country-selection">
                <img src="../../assets/country.png" alt="country">
                <img src="../../assets/btn-down.png" alt="country">
            </span>
            <div class="user-line"></div>
            <p>Usuário</p>
        </div>
    </div>
</template>

<style scoped>
.nav-container {
    width: 100%;
    margin-bottom: 48px;
    display: flex;
    padding: 0px 40px;
    background-color: #12121A;
    box-shadow: 0px 4px 1px rgba(0, 0, 0, 0.25);
    justify-content: space-evenly;

}

.logo {
    font-size: 1.5rem;
    font-weight: 700;
}

.logo span {
    color: #F5760F
}

.nav-container ul {
    display: flex;
    align-items: center;
    width: 40%;
    justify-content: space-evenly;
    font-size: 0.9rem;
}

.nav-container ul li {
    list-style: none;
}

.nav-container a {
    text-decoration: none;
    color: #fff;
}

.nav-container a:hover {
    color: #F5760F;
}

.link-active {
    color: #F5760F;
}

.user-section {
    display: flex;
    margin-left: 290px;
    align-items: center;

}

.country-selection {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 5px
}

.user-line {
    width: 35px;
    height: 0px;
    border: 1px solid rgba(248, 248, 248, 0.5);
    transform: rotate(90deg);
}
a.router-link-active  {
    color: #F5760F;
}
a.router-link-exact-active {
    color: #F5760F;
}

</style>