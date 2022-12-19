<script>
export default {
    props: {
        isOpen: Boolean
    },
    created() {
        document.addEventListener('keyup', (e) => {
            if (e.key === "Escape") {
                this.handleClose()

            }
        })   
    },
    methods: {
        handleClose() {
            this.$emit('close')
        }
    },
    emits: ['close']
}
</script>
<template>
    <div class="modal" id="backdrop" v-if="isOpen">
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
    z-index: 1;

}
.modal-container {
    animation: modalEffect 500ms ;
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