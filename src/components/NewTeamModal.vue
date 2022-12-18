<script>
export default {
    created() {
        document.addEventListener('keyup', (e) => {
            if (e.key === "Escape") {
                this.isOpen = false
            }
        })
    },
    data() {
        return {
            isOpen: true
        }
    }
}
</script>
<template>
    <div class="modal fade" v-if="isOpen">
        <div class="modal-container">
            <slot></slot>
        </div>
    </div>
</template>

<style scoped>
.modal {
    position: fixed;
    background-color: rgba(0, 0, 0, 0.5);
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    cursor: pointer;

}
</style>